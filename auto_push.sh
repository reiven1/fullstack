#!/bin/bash
# auto_push.sh
# 매 분 정각 0초에만 변경 확인 → 자동 커밋 + 푸시

while true; do
    # 현재 초
    sec=$(date +%S)
    
    # 다음 정각까지 대기
    sleep_time=$((60 - 10#$sec))
    sleep $sleep_time

    # 정각 0초에 실행
    now=$(date +%S)
    if [ "$now" -eq 0 ]; then
        # 변경 사항 스테이징
        git add -A

        # 변경 사항이 있으면 커밋
        if ! git diff-index --quiet HEAD --; then
            git commit -m "Auto save $(date +'%Y-%m-%d %H:%M:%S')"
            git push origin main
            echo "Changes pushed at $(date +'%H:%M:%S')"
        else
            echo "No changes at $(date +'%H:%M:%S')"
        fi
    fi
done
