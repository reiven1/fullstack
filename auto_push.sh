#!/bin/bash
# auto_push.sh
# 1분마다 변경 확인 → 자동 커밋 + 푸시

while true; do
    # 모든 변경사항 스테이징
    git add -A
    
    # 변경 사항이 있으면 커밋
    if ! git diff-index --quiet HEAD --; then
        git commit -m "Auto save $(date +'%Y-%m-%d %H:%M:%S')"
        git push origin main
        echo "Changes pushed at $(date +'%H:%M:%S')"
    fi
    
    # 60초마다 확인
    sleep 60
done

