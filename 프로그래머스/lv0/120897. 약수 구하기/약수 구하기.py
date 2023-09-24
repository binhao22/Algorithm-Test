def solution(n):
    answer = []
    for i in range (n):
        answer.append(i+1) if n % (i+1) == 0 else 1
    return answer