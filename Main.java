class Main
{
    public static class Calculator
    {
        //declare parent class variable
        private int num1 ,  num2;
        //declare child class variable
        public int num3, fact;

        //Assign value for num1
        public void setNum1(int num1) {
            this.num1 = num1;
        }

        public int getNum1() {
            return num1;
        }

        //Assign value for num2
        public void setNum2(int num2) {
            this.num2 = num2;
        }

        public int getNum2() {
            return num2;
        }

        //Assign value for num3
        public void setNum3(int num3) {
            this.num3 = num3;
        }

        public int getNum3() {
            return num3;
        }

        //Assign value for fact variable
        public void setFact(int fact) {
            this.fact = fact;
        }

        public int getFact() {
            return fact;
        }

        //summation function
        public double add(double num1, double num2)
        {
            return num1 + num2;
        }
        //subtraction function
        public double subtract(double num1, double num2)
        {
            return num1 - num2;
        }
        //multiplication function
        public double multiply(double num1, double num2)
        {
            return num1 * num2;
        }
        //division function
        public double divide(double num1, double num2)
        {
            if (num2 == 0)
            {
                System.out.println("Can't divide by Zero!");
                return 0;
            }
            return num1 / num2;
        }
    }

    public static class  proCalculator extends Calculator
    {
        //Square Root function
        public double SquareRoot(int num3)
        {
            if(num3<0)
            {
                System.out.println("Square root of negative number is not defined");
                return 0;
            }
            return Math.sqrt(num3);
        }
        //Advance Addition function
        public double AdvanceAddition(double num1, double num2)
        {
            //add 10 to the summation result
            return super.add(num1, num2) + 10;
        }
        //factorial function
        public int factorial(int fact) {
            if (fact < 0) {
                System.out.println("Factorial of negative numbers is not defined");
                return 0;
            }

            int result = 1;
            for (int i = 1; i <= fact; i++) {
                result *= i;
            }
            return result;
        }
    }
    public static void main(String[] args)
    {
        Calculator normalCalculator = new Calculator();
        proCalculator proCalculator = new proCalculator();


        //assign value in the main
        normalCalculator.setNum1(6);
        normalCalculator.setNum2(2);
        proCalculator.setNum1(2);
        proCalculator.setNum2(4);
        proCalculator.setNum3(4);
        proCalculator.setFact(6);


        System.out.println("I used set and get function to assign the value for num1, num2, num3 and fact ");
        System.out.println("so we don't need to get the number by the user. \n\n");


        System.out.println("The summation of " + normalCalculator.getNum1()+" and "+normalCalculator.getNum2() +" is " + normalCalculator.add(normalCalculator.getNum1(),normalCalculator.getNum2()));
        System.out.println();
        System.out.println("The subtraction of " + normalCalculator.getNum1()+" and "+normalCalculator.getNum2() +" is " + normalCalculator.subtract(normalCalculator.getNum1(), normalCalculator.getNum2()));
        System.out.println();
        System.out.println("The multiplication of " + normalCalculator.getNum1()+" and "+normalCalculator.getNum2() +" is " + normalCalculator.multiply(normalCalculator.getNum1(), normalCalculator.getNum2()));
        System.out.println();
        System.out.println("The division of " + normalCalculator.getNum1()+" over "+normalCalculator.getNum2() +" is " + normalCalculator.divide(normalCalculator.getNum1(), normalCalculator.getNum2()));
        System.out.println();
        System.out.println("The square root of " + proCalculator.getNum3()  + " is " + proCalculator.SquareRoot(proCalculator.getNum3()));
        System.out.println();
        System.out.println("The advance addition of " + proCalculator.getNum1() + " and " + proCalculator.getNum2() + " is "  + proCalculator.AdvanceAddition(proCalculator.getNum1(), proCalculator.getNum2()));
        System.out.println();
        System.out.println("The factorial of " + proCalculator.getFact() + " is " + proCalculator.factorial(proCalculator.getFact()));
    }
}