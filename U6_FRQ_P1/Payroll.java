public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    
    /* Creates a Payroll object
     
       PRECONDITIONS: items != null, items.length >= 3
     */
    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }
   
    /* Returns the bonus threshold as described in part (a).
    */
    public double computeBonusThreshold() {
        int min = itemsSold[0];
        int max = itemsSold[0];

        int total = 0;

        for (int num : itemsSold){
            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
            total += num;
        }
        return (double) (total - min - max) / (itemsSold.length - 2);
    }

   
    /* Computes employee wages as described in part (b) and stores them in
    wages. The parameter fixedWage represents the fixed amount each
    employee is paid per day. The parameter perItemWage represents the
    amount each employee is paid per item sold.
    */
    public void computeWages(double fixedWage, double perItemWage) {
        for (int i = 0; i < wages.length; i ++){
            wages[i] = fixedWage + perItemWage * itemsSold[i];
            if (itemsSold[i] > computeBonusThreshold()){
                wages[i] *= 1.1;
            }
        }
    }

    public double[] getWages() {
        return wages;
    }
    

}
  