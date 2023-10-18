def solution(before, after):
    answer = 0
    for i in before:
        if i in after:
            after = after.replace(i, "", 1)
    if after == "":
        answer = 1
    return answer