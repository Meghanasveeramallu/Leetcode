class MedianFinder {
private:
    priority_queue<int, vector<int>, greater<int>> above_;
    priority_queue<int> below_;

public:
    MedianFinder() = default;
    
    void addNum(int num) {
        if (empty(above_) || num >= above_.top()) {
            above_.push(num);
            if (size(above_) > size(below_) + 1) {
                below_.push(above_.top());
                above_.pop();
            }
        } else {
            below_.push(num);
            if (size(below_) > size(above_)) {
                above_.push(below_.top());
                below_.pop();
            }
        }
    }
    
    double findMedian() const {
        if (size(below_) == size(above_))
            return 0.5 * (below_.top() + above_.top());
        
        return above_.top();
        
    }
};

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder* obj = new MedianFinder();
 * obj->addNum(num);
 * double param_2 = obj->findMedian();
 */
