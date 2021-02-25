## 5. 图 graph ??
> 图可能有环，所有用一个辅助hashSet确保不进入死循环。
> 1. 将题目图结构用GraphGenerator更改。
> 2. 创建Graph 对象
### 1. BFS
> queue 
### 2. DFS
> stack
### 3. 拓扑排序
> 循环依赖问题
> 依次找到入渡为0的点，断掉影响
>
### 4. 最小生成树 
确保联通，并全值最小
* 1. k  Kruskal
> k：最小边开始，形成环之前停止。
2. prim
3. dijkstra