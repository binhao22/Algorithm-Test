def solution(n):
    answer = 0
    for i in range(n):
        answer += 1 if n % (i+1) == 0 else 0
    return answer