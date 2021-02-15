# sort
> 稳定性：相同的两个数，排序位置不确定。
## 1. select sort
> 选择排序，选择最值进行移动排序 O(N2) 不稳定
> 外层循环-1，因为j=i+1要确定有值。
## 2. Bubble sort
> 前后两数大小交换, 后面的数字先排好 O(N2)
## 3. Insert sort
> 与左侧比对大小。 排序性能与初始化状态有关。O(N2)
> 左侧有数，范围减少j--
> 希尔排序
## 4. merge Sort 归并排序
>递归，分治
> 空间复杂度O(N) 时间复杂度O(NlgN)
> 额外空间储存merge结果
## 5. quick Sort
>分治
> 左右同时搜索与中轴 大或小，然后交换。 中轴值在边界则最差O(N2), 中轴随机O(N*lgN)
>[i]<num, [i] 与 less区的下一个交换，less区右扩，i++
>[i]>num, [i] 与 more区前一个交换，more区左扩，i原地
>[i]=num,i++
##6. heap Sort 桶排序
> 完全二叉树； 分大根堆(大顶堆)，小根堆 
> 空间复杂度O(1) 时间复杂度O(NlgN)
> 
# search
## 1. binary search
> O(logN)
> 中间值 左右两侧判断
> 不一定有序

# structure
## LinkList
### LinkList to array
> 指针移动
### reverse list 翻转
> pre->head->next // 记下next; head->pre; pre前移; head 前移  
> 双链表 reverse
> 
> 
# tree
## 二叉树
> 左子树: 2*i+1; 右子树: 2*i+2; 父子书: (i-1)/2