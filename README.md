# 猜数字

# 游戏规则

1.电脑出数字，玩家猜。

2.电脑出一个没有重复数字的4个数。

3.玩家每猜一个数字，电脑就要根据这个数字给出几A几B（其中A前面的数字表示位置正确的数的个数，而B前的数字表示数字正确而位置不对的数的个数）

举个栗子：如正确答案为 5234，而猜的人猜 5346，则是 1A2B，其中有一个5的位置对了，记为1A，而3和4这两个数字对了，而位置没对，因此记为 2B，合起来就是 1A2B。

4.接着玩家再根据出题者的几A几B继续猜，直到猜中（即 4A0B）为止。

5.玩家有五次机会猜数字（五次以后为Game Over）

# 测试机型
红米note4X
