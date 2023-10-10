def solution(s1, s2):
    answer = 0
    for i in s1:
        answer += 1 if i in s2 else 0
    return answer