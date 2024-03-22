def solution(arr):
    answer = []
    answer.append(arr[0])
    for i in range(1, len(arr)):
        tmp = answer.pop()
        answer.append(tmp)
        if arr[i] != tmp:
            answer.append(arr[i])
    return answer