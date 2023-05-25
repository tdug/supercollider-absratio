AbsRatio : UGen {
    *kr {|x,y| ^this.multiNew('control', x, y) }
    *ar {|x,y| ^this.multiNew('audio', x, y) }
}
