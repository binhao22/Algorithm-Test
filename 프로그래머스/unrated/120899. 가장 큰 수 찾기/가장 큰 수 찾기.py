def solution(array):
    answer = []
    array2 = sorted(array)
    answer.append(array2[-1])
    answer.append(array.index(answer[0]))
    return answer