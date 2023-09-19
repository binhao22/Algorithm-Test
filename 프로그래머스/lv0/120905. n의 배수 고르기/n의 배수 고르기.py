def solution(n, numlist):
    answer = []
    for i in numlist:
        answer.append(i) if i % n == 0 else 1
    return answer