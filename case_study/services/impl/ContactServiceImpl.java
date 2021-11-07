package case_study.services.impl;

import case_study.models.Contract;
import case_study.validate_readwritefile.readwritefile.WriteReadFileContract;
import case_study.validate_readwritefile.validate.ValidateContract;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ContactServiceImpl {
    public static Queue<Contract> contractQueue;

    public static void setContractQueue(Queue<Contract> contractQueue) {
        ContactServiceImpl.contractQueue = contractQueue;
    }

    public ContactServiceImpl() {
        contractQueue = new LinkedList<>();
    }

    public ContactServiceImpl(Queue<Contract> contractQueue) {
        this.contractQueue = contractQueue;
    }

    public static Queue<Contract> getContractQueue() {
        return contractQueue;
    }

    static Scanner input = new Scanner(System.in);

    public static void display() {
        Contract contract = new Contract(1, 1, 100, 1000, 123);
        Contract contract1 = new Contract(2, 2, 1000, 10000, 1234566);
        contractQueue.add(contract);
        contractQueue.add(contract1);

        for (Contract contract2 : contractQueue) {
            System.out.println(contract2);
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
        for (Contract contract1 : contractQueue) {
            System.out.println(contract1);
        }
        WriteReadFileContract.writeFileContract(contract, WriteReadFileContract.CONTRACT);
    }

    public static void editContract() {
        display();
        boolean check = false;
        WriteReadFileContract.readContract(WriteReadFileContract.CONTRACT);
        System.out.println("Nhập id Contract bạn muốn sửa");
        int id = Integer.parseInt(input.nextLine());

        while (( contractQueue.peek()) != null) {
            if (id == contractQueue.peek().getIdBooking()) {
                check = true;
            }
            if(check){
                contractQueue.poll();

                break;
            }else {
                addContract();
                break;
            }
        }
    }

}
