public class Traph2o {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(TrapedPani(height));
    }
    public static int  TrapedPani(int a[]){
        //calculate leftmax - array
        //calculate rightmax - array
        //loop
        //waterlevel= min(leftmax,rightmax)
        //trappedwater = waterlevel-heifht[i]
        //leftmax and rightmx are auxilary arrays
        int [] leftmax = new int[a.length];
        leftmax[0] = a[0]; //here the left maximum of first element in the array a is the element iself so this strp is written
        for(int i=1;i<a.length;i++){
            leftmax[i]= Math.max( a[i],leftmax[i-1]);
            //this step is written for calculating the leftmax wrt to element in a.
            //here i-1 is written because we want to compare the current hight with the maximum left bounday whcih is existing in leftmax[i-1]
        }  
        //calculate rightmax - array
        //the first element in the rightmax is the same elemnt in the a. since there wont be elemen to the riht of ot to compare.
        int [] rightmax = new int[a.length];
        rightmax[a.length-1]=a[a.length-1];
        //now we use a for loop for calculating the remaining elements in the rightmax array
        for(int i=a.length-2;i>=0;i--){//why >=0 this is because i starts from 0.
            rightmax[i]= Math.max(a[i],rightmax[i+1]);
            //here we use i+1 because we need to compaare the elemnt that is maximum of the specific
            // height and the righmost max elemnt till now which is stored in the i+1 position of  rightmax.   
        }
        int watertrapped = 0;
        //again we use for loop to calculate the trapped rainwater for each height elemnt and add up everyhting inorder 
        //to calculate the total trapped water.
        for(int i=0;i< a.length;i++){
            int WaterForEachElemnt = Math.min(leftmax[i], rightmax[i]);
            watertrapped+= WaterForEachElemnt -a[i]; //here we are doing this step in order
            //to find the trappedwater which is the differnce of the water heoght from the ground and the height of each elemnt  
        }
        return  watertrapped;
    }
}
