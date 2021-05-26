package udemy.leetCode;

public class main{

    public static void main(String[] args) {
        /*FizzBuzz s = new FizzBuzz();
        System.out.println(s.fizzBuzz(15));
        TwoSum t = new TwoSum();
        int[] arr = {2,7,11,15};
        int[] ans = t.twoSumSecond(arr, 9);
        System.out.println(Arrays.toString(ans));
        maxArea m = new maxArea();
        int[] max = {1,8,6,2,5,4,8,3,7};
        System.out.println(m.maxArea(max));
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum threesum = new ThreeSum();
        System.out.println("========================");
        for (List<Integer> row: threesum.threeSum(nums)){
            for (int val: row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
        //int[] numssss = {1,1,2};
       // removeDuplicates r = new removeDuplicates();
       // System.out.println(r.removeDuplicates(numssss));



        /*int [] RemoveEle = {1};
        RemoveEle rs = new RemoveEle();
        System.out.println(rs.removeElement(RemoveEle, 3));


        int[] RemoveEle2 = {0,1,2,2,3,0,4,2};
        RemoveEle rss= new RemoveEle();
        System.out.println(rss.removeElement(RemoveEle2,2));


        int[] result = {5,7,7,8,8,10};
        FirstALastPos rrrr = new FirstALastPos();
        System.out.println(rrrr.searchRange(result,8)[1]);

        int[] nextPermutation = {1,1};
        NextPermutation next = new NextPermutation();

        next.nextPermutation(nextPermutation);

        int[] numss= {-1,2,1,-4};
        ThreeSumClosest r = new ThreeSumClosest();
        System.out.println(r.threeSumClosest(numss,1));

        int[] nummss = {0,1,3,4,5};
        int target = 3;
        RotatedSortedArray rrr = new RotatedSortedArray();
        System.out.println(rrr.search(nummss, target));*/

        int[] prices = {2,1,2,1,0,1,2};

        BestTimetoBuynSellStock r = new BestTimetoBuynSellStock();
        r.maxProfit(prices);





    }

}
