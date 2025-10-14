package binary_search;



// arr[mid-1] < arr[mid]
// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int left = 0, right = arr.length - 1;
//         while (left < right) {
//             // mid "上取整"，防止 left = mid 时陷入死循环
//             int mid = left + (right - left + 1) / 2;

//             // 注意：为了避免 mid=0 时 arr[mid-1] 越界，判断条件改为 arr[mid-1] < arr[mid]
//             if (arr[mid - 1] < arr[mid]) {
//                 // mid 在上升坡，或 mid 就是峰顶
//                 // 峰顶在 mid 或其右边，不能排除 mid
//                 left = mid;
//             } else {
//                 // mid 在下降坡
//                 // 峰顶一定在 mid 左边，可以安全地排除 mid
//                 right = mid - 1;
//             }
//         }
//         return left;
//     }
// }




// arr[mid]  < arr[mid + 1]

class Solution5 {
    /**
     * 正确的二分查找解法
     * 时间复杂度: O(log(n))
     * 空间复杂度: O(1)
     */
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // 使用标准的 mid 计算，防止 left + right 溢出
            int mid = left + (right - left) / 2;

            // 核心判断逻辑：比较 mid 和 mid+1 的大小来判断 mid 处于上升坡还是下降坡
            if (arr[mid] < arr[mid + 1]) {
                // mid 在上升坡，峰顶一定在右边
                // 并且 mid 肯定不是峰顶，所以可以从 mid + 1 开始搜索
                left = mid + 1;
            } else {
                // mid 在下降坡，或者 mid 本身就是峰顶
                // 峰顶在 mid 或 mid 的左边，所以 right 缩减到 mid
                right = mid;
            }
        }

        // 当循环结束时，left 和 right 相遇，指向的就是峰顶元素
        return left;
    }
}




public class Main5 {




}
