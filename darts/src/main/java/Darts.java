class Darts {
    private double x, y;
    Darts(double x, double y) {
        this.x = Math.abs(x);
        this.y =Math.abs(y);
    }

    int score() {
       double hypotenuse;
       if(this.x == 0) hypotenuse = y;
       else if (this.y == 0) hypotenuse = x;
       else hypotenuse = Math.sqrt(this.x*this.x + this.y*this.y);  

       if (hypotenuse > 5 && hypotenuse <=10) return 1;
       else if (hypotenuse<=5 && hypotenuse >1) return 5;
       else if (hypotenuse<=1) return 10;
       else return 0;
    }

}
