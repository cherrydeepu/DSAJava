/*n = 5
→ 5 + sum(4)
→ 4 + sum(3)
→ 3 + sum(2)
→ 2 + sum(1)
→ 1 + sum(0)
 */
class SumRecursion {
    static int sum(int n) {
        if(n == 0){
            return 0;
        }else{
        return n + sum(n - 1);
        }
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(sum(n));
    }
}
// 5+sum(5-1)
// 5+4+sum(4-1)
// 5+4+3+sum(3-1)
// 5+4+3+2+sum(2-1)
// 5+4+3+2+1+sum(1-1)
