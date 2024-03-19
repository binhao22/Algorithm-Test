def solution(array, commands):
    answer = []
    for i in commands:
        tmp = array[i[0]-1:i[1]]
        tmp.sort()
        k = tmp[i[2]-1]
        answer.append(k)
        tmp = []
    return answer