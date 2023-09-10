def solution(n):
    for i in range(1, 100):
        if i * 6 % n == 0:
            answer = i
            break
    return answer