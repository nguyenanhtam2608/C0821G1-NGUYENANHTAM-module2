package case_study.services.impl;

import case_study.models.Contract;
import case_study.validate_readwritefile.readwritefile.WriteReadFileContract;
import case_study.validate_readwritefile.validate.ValidateContract;

import java.util.*;
import java.util.stream.Collectors;

public class ContactServiceImpl {
    public static Queue<Contract> contractQueue;

    public static void setContractQueue(Queue<Contract> contractQueue) {
        ContactServiceImpl.contractQueue = contractQueue;
    }

    public ContactServiceImpl() {
        contractQueue = new LinkedList<>();
        contractQueue.addAll(WriteReadFileContract.readContract(WriteReadFileContract.CONTRACT));
    }

    public ContactServiceImpl(Queue<Contract> contractQueue) {
        this.contractQueue = contractQueue;
    }

    public static Queue<Contract> getContractQueue() {
        return contractQueue;
    }

    static Scanner input = new Scanner(System.in);

    public static void display() {
        for (Contract contract1 : contractQueue) {
            System.out.println(contract1);
        }
    }

    public static void addContract() {
        int idCon = ValidateContract.idContract();
        int idBook = ValidateContract.idBooking();
        double advance = ValidateContract.advanceDepositAmount();
        double total = ValidateContract.totalPaymentAmount();
        int idCus = ValidateContract.idCustomer();
        Contract contract = new Contract(idCon, idBook, advance, total, idCus);
        contractQueue.add(contract);
        WriteReadFileContract.writeFileContract(contract, WriteReadFileContract.CONTRACT);
        display();
    }

    public static void editContract() {
        display();
        boolean check = true;
        System.out.println("Nhập id Contract bạn muốn sửa");
        int id = Integer.parseInt(input.nextLine());

        // chuyển đổi queue về list;
        List<Contract> contract1 = contractQueue.stream().collect(Collectors.toCollection(ArrayList::new));
        for (int i = 0; i < contract1.size(); i++) {
            if (id == contract1.get(i).getNumberContract()) {
                contract1.remove(i);
                check = true;
                break;
            }else {
                check =false;
            }
        }
        if(check) {
            System.out.println("Bạn đã xóa thành công ");

            //Cách chuyển đổi danh sách thành hàng đợi để đạt được FIFO
            contractQueue = new LinkedList<>(contract1);
            for (Contract contract : contractQueue) {
                System.out.println(contract);
            }
            addContract();
        }else {
            System.out.println("Không có trong file");
        }
    }

}
