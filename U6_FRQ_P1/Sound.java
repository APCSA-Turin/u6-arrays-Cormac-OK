public class Sound {

    /* the array of values in this sound; guaranteed not to be null */
    private int[] samples;
  
    public Sound(int[] samples) {
        this.samples = samples;
    }
    
    
    public int[] getSamples() {
        return samples;
    }
    
    /* Changes those values in this sound that have an amplitude
     * greater than limit. Values greater than limit are changed to
     * limit. Values less than -limit are changed to -limit.
     * The method returns the total number of values that were changed
     * in the array.
     *
     * PRECONDITION: limit ≥ 0
     */
    public int limitAmplitude(int limit) {
        int count = 0;
        for (int i = 0; i < samples.length; i ++){
            if (samples[i] > limit){
                samples[i] = limit;
                count ++;
            }
            else if (samples[i] < -1* limit){
                samples[i] = -1 * limit;
                count ++;
            }
    
        }

        return count;
    }
    
  
    /* Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     *
     * PRECONDITION: samples contains at least one nonzero value
     *
     * POSTCONDITION: the length of samples reflects the removal
     *                of starting silence
     */
    public void trimSilenceFromBeginning() {
        int firstNonZero = samples.length - 1;
        for (int i = samples.length - 1; i >=0; i--){
            if (samples[i] != 0){
                firstNonZero = i;
            }
        }
    
        int[] newSamples = new int[samples.length - firstNonZero];
    
        for (int i = firstNonZero; i < samples.length; i++){
            newSamples[i-firstNonZero] = samples[i];
        }
    
        samples = newSamples;
        
    }
    
 }
 