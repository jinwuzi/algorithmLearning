class SORT {

	public static int recursionNumber = 0; 

	public static void arrayAvertSort(int[] a){
		// 倒排序算法
		int N = a.length;
		for (int i =0; i < N/2; i++){
			int temp = a[i];
			a[i] = a[N-1-i];
			a[N-1-i] = temp;
		}
	}

	public static int halfPartSearch(int key, int[] a, int lo, int hi){
		// 二分查找递归算法
		if(lo > hi) return -1;

		int mid = lo + (hi - lo)/2;  // 计算中位数下标

		recursionNumber++;
		
		System.out.println("begin a new recursion.");
		System.out.printf("a[mid]: %d \n",a[mid]);

		if(key > a[mid])      return halfPartSearch(key, a, mid+1, hi);

		else if(key < a[mid]) return halfPartSearch(key, a, lo, mid-1);

		else                  return mid;
	}

	public static void main(String[] args) {
		// 运行主方法
		//int[] a = {1,2,3,4,5,6,7,8,19,33,89};

		int[] b = {809,708,175,127,123,110,109,88,79,78,69,66,36,12};
		// 测试倒排序方法
		//arrayAvertSort(a);
		// 打印
		/***for(int i =0; i< a.length; i++){
			System.out.println(a[i]);
		}***/

		arrayAvertSort(b);

		int targetV = 110;
		// 测试二分查找算法
		int targetIndex = halfPartSearch(targetV, b, 0, b.length);
		
		System.out.printf("b.length : %d \n",b.length);
		System.out.printf("targetIndex  : %d \n",targetIndex);
		System.out.printf("%d in the index of b : %d \n",targetV,b.length - targetIndex -1);
		System.out.printf("recursion Number : %d",recursionNumber);
	}
}
