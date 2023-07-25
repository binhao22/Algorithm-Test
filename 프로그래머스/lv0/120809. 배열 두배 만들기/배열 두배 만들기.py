def solution(numbers):
    answer = [0] * len(numbers)
    idx = 0
    for i in numbers:
        answer[idx] = i*2
        idx += 1
    return answer