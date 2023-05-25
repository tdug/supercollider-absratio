+ SimpleNumber {
    absRatio { |other| ^(this > other).if({other / this}, {this / other}) }
}