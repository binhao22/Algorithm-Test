def solution(n):
    answer = 0
    for i in range(1, n+1):
        flag = 0
        for j in range(1, i+1):
            if i % j == 0:
                flag += 1
                if flag == 3:
                    answer += 1
                    break
    return answer