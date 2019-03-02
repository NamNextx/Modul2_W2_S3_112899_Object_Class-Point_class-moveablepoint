public class MoveAblePoint extends Point {

    private float xSpeed = 0;
    private float ySpeed = 0;

    public MoveAblePoint() {

    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float arrSpeed[] = new float[2];
        arrSpeed[0] = xSpeed;
        arrSpeed[1] = ySpeed;
        return arrSpeed;
    }



    public void move() {

        float x = getX();
        float y = getY();
        x += xSpeed;
        y += ySpeed;
        super.setX(x);
        super.setY(y);

    }
    public float [] getXY() {
        float arr[] = new float[2];
        arr[0] = 9;
        arr[1] = 9;
        return arr;
    }

    public String toString() {
        return super.toString() + ", speed= (" + this.getxSpeed() + ")";
    }
}

