# 排序算法
[TOC]
****


## 0.稳定性
> 相同的两个数，排序位置不确定。

|  sort   |  时间   | 空间 | 稳定性|
| --- | --- | --- | --- | 
| select    | O(N2) | O(1) | 不稳 | 
| bubble   |O(N2) | O(1) |  稳 | 
| insert     |O(N2) | O(1) |  稳 | 
| merge |O(N*lgN) | O(N) |  稳 | 
| quick(random) |O(N*lgN ) | O(lgN) |  不 稳 | 
| heap |O(N*lgN ) | O(1) |  不 稳 | 
> merge 稳定性好，空间复杂度高。
>quick 常数项低，不要求稳定性的前提下首选。
> heap 空间复杂度最低



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
>分治 不稳定
> 左右同时搜索与中轴 大或小，然后交换。 中轴值在边界则最差O(N2), 中轴随机O(N*lgN)
>[i]<num, [i] 与 less区的下一个交换，less区右扩，i++
>[i]>num, [i] 与 more区前一个交换，more区左扩，i原地
>[i]=num,i++
##6. heap Sort 桶排序
> 完全二叉树； 分大根堆(大顶堆)，小根堆 不稳定
> 空间复杂度O(1) 时间复杂度O(NlgN)
>

## 总结：

不稳定：选择，快排，堆排
稳定：冒泡，插入，归并，桶排
> https://www.bilibili.com/video/BV16K4y157vm?p=4&t=2082


> P4 sort 总结
