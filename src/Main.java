public class Main {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.model="LG";
        phone.colour="White";
        phone.editionYear=2021;
        System.out.println(phone.model+"\n"+phone.colour+"\n"+phone.editionYear);


        Phone phone2=new Phone();
        phone2.model="Poco";
        phone2.colour="Grey";
        phone2.editionYear=2022;
        System.out.println(phone2.model+"\n"+phone2.colour+"\n"+phone2.editionYear);


        Phone phone3=new Phone();
        phone3.model="Samsung";
        phone3.colour="Black";
        phone3.editionYear=2023;
        System.out.println(phone3.model+"\n"+phone3.colour+"\n"+phone3.editionYear);

    }
}