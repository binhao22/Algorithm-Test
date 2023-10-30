def solution(emergency):
    answer = []
    emergecy_sorted = []
    # 정렬한 emergency_sorted
    emergency_sorted = sorted(emergency)
    emergency_sorted.reverse()
    # emergency 에서 꺼냄 -> emergency_sorted 에서 인덱스 찾음 -> 인덱스+1 값을 answer 에 저장
    for i in emergency:
        tmp = emergency_sorted.index(i)
        answer.append(tmp+1)
    return answer