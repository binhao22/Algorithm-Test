def solution(n):
    for i in range(n+1):
        if i*i == n:
            answer = 1
            break
        else:
            answer =2
    return answer