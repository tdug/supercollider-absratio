AbsRatio : UGen {
    *kr {|x,y=1.0| ^this.multiNew('control', x, y) }
    *ar {|x,y=1.0| ^this.multiNew('audio', x, y) }
}
