for _ in range(int(input())):
    n=int(input())
    s=sum(list(map(int,input().split())))
    print("YES" if s%2!=0 else "NO")
