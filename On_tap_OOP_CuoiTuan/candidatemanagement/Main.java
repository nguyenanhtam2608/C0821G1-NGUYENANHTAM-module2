package on_tap_oop_cuoituan.candidatemanagement;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------HỆ THỐNG QUẢN LÝ THÍ SINH--------");
        System.out.println("1. Experience\n" +
                "2. Fresher\n" +
                "3. Internship\n" +
                "4. Searching\n" +
                "5. Exit");
        Scanner input = new Scanner(System.in);


        ArrayList arrayList = new ArrayList();
        arrayList.addExp(1, "Nguyễn", "Anh Tâm", "26/08/2002", "Quảng nam", 763709673, "nguyenanham@gmail.com", 0, 2, "code");
        arrayList.addExp(1, "Trần", "Anh Tuấn", "26/08/2002", "Đà Nẵng", 763709673, "nguyenanham@gmail.com", 0, 2, "code");
        ArrayListFre arrayListFre = new ArrayListFre();
        arrayListFre.addFre(1, "Lê", "Phương", "26/08/2002", "Quảng Ngãi", 763709673, "nguyenanham@gmail.com", 1, "26/12/2021", 1, "Duy Tân");
        arrayListFre.addFre(1, "Mai", "Thanh", "26/08/2002", "Huế", 763709673, "nguyenanham@gmail.com", 1, "26/12/2021", 1, "Duy Tân");
        ArrayListInt arrayListInt = new ArrayListInt();

        int option;

        do {
            System.out.println("-------------Enter option---------------");
            option = Integer.parseInt(input.nextLine());
            switch (option) {
                case 1: {
                    String select;
                    do {
                        System.out.println("Nhập id");
                        int idExp = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập họ");
                        String firsNameExp = input.nextLine();
                        System.out.println("Nhập Tên");
                        String lastNameExp = input.nextLine();
                        boolean check = false;
                        System.out.println("Nhập ngày tháng năm sinh");
                        String birthDateExp = input.nextLine();
                        do {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            simpleDateFormat.setLenient(false);
                            try {
                                check = false;
                                simpleDateFormat.parse(birthDateExp);
                                break;
                            } catch (ParseException e) {
                                check = true;
                                System.out.println("Nhập ngày tháng năm sinh");
                                birthDateExp = input.nextLine();
                            }
                        } while (check = true);

                        System.out.println("Địa chỉ");
                        String adderssExp = input.nextLine();
                        long phoneExp;
                        long min = 0100000000;
                        long max = 999999999;
                        do {
                            System.out.println("Nhập số điện thoại");
                            System.out.println("Hãy nhập nhập từ số ở vị trí sau số 0 ");
                            System.out.print("84+");
                            phoneExp = Long.parseLong(input.nextLine());

                        } while (phoneExp > max || phoneExp < min);
                        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
                        String emailExp;
                        do {
                            System.out.println("Email.com");
                            emailExp = input.nextLine();
                        } while (Pattern.matches(EMAIL_PATTERN, emailExp) == false);
                        int experience = 0;

                        int expInYear = 0;
                        do {
                            System.out.println("nhập số năm kinh nghiệm ");
                            experience = Integer.parseInt(input.nextLine());
                        } while (expInYear < 0 || expInYear > 100);

                        System.out.println("Hãy nhập kĩ năm chuyên môn");
                        String proSkill = input.nextLine();
                        arrayList.addExp(new Experience(idExp, firsNameExp, lastNameExp, birthDateExp, adderssExp, phoneExp, emailExp, experience, expInYear, proSkill));
                        for (Experience experience1 : arrayList.getExperienceList()) {
                            System.out.println(experience1);
                        }
                        System.out.println("Bạn có muốn tiếp tục tạo thêm không,Nhấp Y để tiếp tục,Nhấn 1 kí tự bất kì để thoát ");
                        select = input.nextLine();
                        if (select != "y" || select != "Y") {
                            System.out.println("----------HỆ THỐNG QUẢN LÝ THÍ SINH--------");
                            System.out.println("1. Experience\n" +
                                    "2. Fresher\n" +
                                    "3. Internship\n" +
                                    "4. Searching\n" +
                                    "5. Exit");

                            for (Experience experience1 : arrayList.getExperienceList()) {
                                System.out.println(experience1);
                            }
                            break;
                        }
                    } while (select == "y" || select == "Y");
                    break;
                }

                case 2: {
                    String select = null;
                    do {
                        System.out.println("Nhập id");
                        int idFre = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập họ");
                        String firsNameFre = input.nextLine();
                        System.out.println("Nhập Tên");
                        String lastNameFre = input.nextLine();
                        boolean check = false;
                        System.out.println("Nhập ngày tháng năm sinh");
                        String birthDateFre = input.nextLine();
                        do {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            simpleDateFormat.setLenient(false);
                            try {
                                check = false;
                                simpleDateFormat.parse(birthDateFre);
                                break;
                            } catch (ParseException e) {
                                check = true;
                                System.out.println("Nhập ngày tháng năm sinh");
                                birthDateFre = input.nextLine();
                            }
                        } while (check = true);

                        System.out.println("Địa chỉ");
                        String adderssFre = input.nextLine();
                        long phoneFre;
                        long min = 0100000000;
                        long max = 999999999;
                        do {
                            System.out.println("Nhập số điện thoại");
                            System.out.println("Hãy nhập nhập từ số ở vị trí sau số 0 ");
                            System.out.print("84+");
                            phoneFre = Long.parseLong(input.nextLine());

                        } while (phoneFre > max || phoneFre < min);
                        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
                        String emailFre;
                        do {
                            System.out.println("Email.com");
                            emailFre = input.nextLine();
                        } while (Pattern.matches(EMAIL_PATTERN, emailFre) == false);
                        int fresheCandidate = 1;
                        System.out.println("Nhập ngày tháng năm tốt nghiệp");
                        String draduationDate = input.nextLine();
                        do {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            simpleDateFormat.setLenient(false);
                            try {
                                check = false;
                                simpleDateFormat.parse(draduationDate);
                                break;
                            } catch (ParseException e) {
                                check = true;
                                System.out.println("Nhập ngày tháng năm tốt nghiệp");
                                draduationDate = input.nextLine();
                            }
                        } while (check = true);


                        int graduationRank = 0;
                        int xuatsac = 1;
                        int kha = 3;
                        int tot = 2;
                        int kem = 4;
                        do {
                            System.out.println("Nhập loại tốt nghiệp");
                            System.out.println(
                                    "                     xuatsac = 1;\n" +
                                            "                     kha = 3;\n" +
                                            "                     tot = 2;\n" +
                                            "                     kem = 4");
                            graduationRank = Integer.parseInt(input.nextLine());

                        } while (graduationRank != xuatsac && graduationRank != kha && graduationRank != tot && graduationRank != kem);
                        System.out.println("Nhập trường đại học");
                        String schoolFre = input.nextLine();

                        arrayListFre.addFre(new Fresher(idFre, firsNameFre, lastNameFre, birthDateFre, adderssFre, phoneFre, emailFre, fresheCandidate, draduationDate, graduationRank, schoolFre));
                        for (Fresher fresher : arrayListFre.getFresherList()) {
                            System.out.println(fresher);
                        }
                        System.out.println("Bạn có muốn tiếp tục tạo thêm không,Nhấp Y để tiếp tục,Nhấn 1 kí tự bất kì để thoát ");
                        select = input.nextLine();
                        if (select != "y" || select != "Y") {
                            System.out.println("----------HỆ THỐNG QUẢN LÝ THÍ SINH--------");
                            System.out.println("1. Experience\n" +
                                    "2. Fresher\n" +
                                    "3. Internship\n" +
                                    "4. Searching\n" +
                                    "5. Exit");
                            for (Fresher fresher : arrayListFre.getFresherList()) {
                                System.out.println(fresher);
                            }
                            break;
                        }
                    } while (select == "y" || select == "Y");

                    break;

                }
                case 3: {
                    String select = null;
                    do {
                        System.out.println("Nhập id");
                        int idInt = Integer.parseInt(input.nextLine());
                        System.out.println("Nhập họ");
                        String firsNameInt = input.nextLine();
                        System.out.println("Nhập Tên");
                        String lastNameInt = input.nextLine();
                        boolean check = false;
                        System.out.println("Nhập ngày tháng năm sinh");
                        String birthDateInt = input.nextLine();
                        do {
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            simpleDateFormat.setLenient(false);
                            try {
                                check = false;
                                simpleDateFormat.parse(birthDateInt);
                                break;
                            } catch (ParseException e) {
                                check = true;
                                System.out.println("Nhập ngày tháng năm sinh");
                                birthDateInt = input.nextLine();
                            }
                        } while (check = true);

                        System.out.println("Địa chỉ");
                        String adderssInt = input.nextLine();
                        long phoneInt;
                        long min = 0100000000;
                        long max = 999999999;
                        do {
                            System.out.println("Nhập số điện thoại");
                            System.out.println("Hãy nhập nhập từ số ở vị trí sau số 0 ");
                            System.out.print("84+");
                            phoneInt = Long.parseLong(input.nextLine());

                        } while (phoneInt > max || phoneInt < min);
                        String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
                        String emailInt;
                        do {
                            System.out.println("Email.com");
                            emailInt = input.nextLine();
                        } while (Pattern.matches(EMAIL_PATTERN, emailInt) == false);
                        int internCandidate = 2;
                        System.out.println("Nhập chuyên ngành");
                        String majors = input.nextLine();
                        int semester;
                        do {
                            System.out.println("Nhập học kì");
                            semester = Integer.parseInt(input.nextLine());
                        } while (semester < 0 || semester > 3);
                        System.out.println("Nhập trường học");
                        String schoolInt = input.nextLine();
                        arrayListInt.addInt(new Intern(idInt, firsNameInt, lastNameInt, birthDateInt, phoneInt, emailInt, internCandidate, majors, semester, schoolInt));
                        for (Intern intern : arrayListInt.getInternList()) {
                            System.out.println(intern);
                        }
                        System.out.println("Bạn có muốn tiếp tục tạo thêm không,Nhấp Y để tiếp tục,Nhấn 1 kí tự bất kì để thoát ");
                        select = input.nextLine();
                        if (select != "y" || select != "Y") {
                            System.out.println("----------HỆ THỐNG QUẢN LÝ THÍ SINH--------");
                            System.out.println("1. Experience\n" +
                                    "2. Fresher\n" +
                                    "3. Internship\n" +
                                    "4. Searching\n" +
                                    "5. Exit");
                            for (Intern intern : arrayListInt.getInternList()) {
                                System.out.println(intern);
                            }
                            break;
                        }
                    } while (select == "y" || select == "Y");
                    break;
                }
                case 4: {
                  //Em chưa làm được ạ
                }
                case 5:{
                    System.out.println("Bạn đã thoát ");
                    return;
                }
            }
        } while (option > 5 || option <= 0);
    }
}
