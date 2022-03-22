class Rbibank {
    double getInterestRate(){
        return 7;
    }
}
class Sbibank extends Rbibank{
    @Override
    double getInterestRate(){
        return  7.5;
    }
}
class Axisbank extends Rbibank{
    @Override
    double getInterestRate(){
        return  8;
    }
}
class Icicibank extends Rbibank{
    @Override
    double getInterestRate(){
        return  8.5;
    }
}
class Banks extends Rbibank{
    public static void main(String[] args) {
        Rbibank rbiobj=new Rbibank();
        System.out.println("Interest rate of Rbi bank: ");
        System.out.println(rbiobj.getInterestRate());
        Sbibank sbiobj=new Sbibank();
        System.out.println("Interest rate of Sbi bank: ");
        System.out.println(sbiobj.getInterestRate());
        Axisbank axisobj=new Axisbank();
        System.out.println("Interest rate of Axis bank: ");
        System.out.println(axisobj.getInterestRate());
        Icicibank iciciobj=new Icicibank();
        System.out.println("Interest rate of Icici bank: ");
        System.out.println(iciciobj.getInterestRate());
    }
}
