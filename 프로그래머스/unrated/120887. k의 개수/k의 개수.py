def solution(i, j, k):
    answer = 0
    for q in range(i, j+1):
        s = str(q)
        for w in s:
            answer += 1 if w == str(k) else 0
    return answer