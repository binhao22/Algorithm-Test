def solution(my_str, n):
    answer = []
    sr = ""
    for i in my_str:
        if len(sr) == n:
            answer.append(sr)
            sr = i
        else:
            sr += "" + i
    answer.append(sr)
    return answer