# structure
## LinkList
### LinkList to array
> 指针移动
### 1. reverse list 翻转
> pre->head->next // 记下next; head->pre翻转; pre前移; head 前移  
> 双链表 reverse
>
### 2. 打印两个链表公共部分
> 双指针，谁小谁一定，相同一起动。越界停。
### 3. 判断是否为回文结构
>m1：压栈 出栈 顺序一致
>m2：从中间压栈，弹出的顺序与前半部分一致 （快慢指针）
>快慢指针: 慢指针一次走一步，快指针一次走两步。快指针到头，慢指针到中点。
> m3：空间 O(1) 找到重点后，将后半段逆序，然后两段指针同时往中间走。
### 4. 将单链表按某值划分左小，中等，右大
>m1: 单链表放入数组，数组上开始partition，在转为linkedlist
>m2: 六个变量。记录小头尾，等头尾，大头尾。然后重连。
>
### 5. CopyListWithRandom 克隆特殊链表
> HashMap
>
###6. FindFirstIntersectNode 有环无环链表


# tree
## 二叉树
> 左子树: 2*i+1; 右子树: 2*i+2; 父子书: (i-1)/2