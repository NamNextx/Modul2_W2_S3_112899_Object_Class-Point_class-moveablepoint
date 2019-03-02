public class Point {
    private float x = 0;
    private float y = 0;


    public Point() {

    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float [] getXY() {
        float arr[] = new float[2];
        arr[0] = this.x;
        arr[1] = this.y;
        return arr;
    }

    @Override
    public String toString() {
        return "(X= " + x + "; y= " + y+")";

    }

//    static class test {
//        public static void main(String[] args) {
//            Point point = new Point();
//
//            System.out.println(point);
//            int length1=point.getXY().length;
//            float arr[]=point.getXY();
//            for (int i=0; i<length1;i++){
//                System.out.println("Arr["+i+"]= "+arr[i]);
//            }
//            point.getXY();
//        }
//    }

    static class Test{
        public static void main(String[] args) {

            // setup position base
            Point point=new Point(1,1);
            System.out.println(point);

            // // move from position base to position 1 with speed 4,4
            MoveAblePoint speed= new MoveAblePoint(2,2, 4,4);
            System.out.println(speed);
            speed.move();

            System.out.println(speed);
            speed.move();

            System.out.println(speed);

//            int length1=speed.getSpeed().length;
//            float arr[]=speed.getSpeed();
//            for (int i=0; i<length1;i++){
//                System.out.println("Arr["+i+"]= "+arr[i]);
//            }
//
//            int length2=speed.getSpeed().length;
//            float arr1[]=speed.getSpeed();
//            for (int i=0; i<length1;i++){
//                System.out.println("Arr["+i+"]= "+arr1[i]);
//            }





        }
    }
}

