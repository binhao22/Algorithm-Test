def solution(nums):
    answer = []
    an = list(set(nums))
    length = len(nums)/2
    for i in an:
        answer.append(i)
        if len(answer) == length:
            break
    return len(answer)
