"""
Definition of Interval:
class Interval(object):
    def __init__(self, start, end):
        self.start = start
        self.end = end
"""

class Solution:
    def canAttendMeetings(self, intervals: List[Interval]) -> bool:
        intervals.sort(key=lambda x: x.start)
        if len(intervals) == 0 : return True
        preEnd = intervals[0].end
        for i in intervals[1:] :
            if i.start < preEnd :
                return False
            preEnd = i.end
        return True 

