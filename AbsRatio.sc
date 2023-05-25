AbsRatio : UGen {
    *kr {|x,y| ^this.multiNew('control', x, y) }
    *ar {|x,y| ^this.multiNew('audio', x, y) }
}

SimpleNumber {
    .absRatio { |other| ^(this > other).if({other / this}, {this / other}) }
}

UGen {
    .absRatio { |other| ^AbsRatio(this, other) }
}