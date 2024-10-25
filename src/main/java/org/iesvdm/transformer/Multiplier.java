package org.iesvdm.transformer;

class Multiplier implements Transformer<Integer>
{
    private int mult;

    public Multiplier(int m)
    {
        mult = m;
    }
    @Override
    public Integer transform(Integer n)
    {
        return n*mult;
    }
}
