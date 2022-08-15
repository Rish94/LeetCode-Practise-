public class rotateleft {
    public static void main(String[] args) {
        int n[] = {1,2,3,4};
        int temp = n[0];
        for(int i=1;i<n.length;i++){
            n[i-1] = n[i];
        }
        n[n.length-1] = temp;
        for(int j=0;j<n.length;j++){
            System.out.println(n[j]);
        }
    }
}
