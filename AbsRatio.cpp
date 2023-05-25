#include "SC_PlugIn.hpp"

static InterfaceTable *ft;

struct AbsRatio : public SCUnit {
public:
    AbsRatio() {
        set_calc_function<AbsRatio, &AbsRatio::next>();
        next(1);
    }

private:
    void next(int inNumSamples) {
        const float* x = in(0);
        const float* y = in(1);
        float* outbuf = out(0);

        for (int i = 0; i < inNumSamples; i++) {
            outbuf[i] = (x[i]>y[i]) ? (y[i]/x[i]) : (x[i]/y[i]);
        }
    }
};

PluginLoad(AbsRatioUGens) {
    ft = inTable;
    registerUnit<AbsRatio>(ft, "AbsRatio");
}