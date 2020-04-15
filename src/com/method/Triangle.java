package com.method;

class Triangle {
//打印一个n行，某符号的等腰三角形
    void printdengyao(int n ,char x){
        for(int i=1;i<=n;i++)//列
        {
            for (int j = 1; j <= n - i; j++)//行 空格
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++)//行 符号
            {
                System.out.print(x);
            }
            System.out.println();
        }
    }

}


