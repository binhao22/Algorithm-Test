def solution(numbers, k):
    answer = 0
    # numbers 의 길이가 2k 보다 커질때까지 append
    tmp = 2*k // len(numbers)
    num = numbers * (tmp+1)
    for i in range(0, 2*k, 2):
        answer = num[i]
    return answer