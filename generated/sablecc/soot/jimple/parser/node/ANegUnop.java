/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.node;

import soot.jimple.parser.analysis.*;

@SuppressWarnings("nls")
public final class ANegUnop extends PUnop
{
    private TNeg _neg_;

    public ANegUnop()
    {
        // Constructor
    }

    public ANegUnop(
        @SuppressWarnings("hiding") TNeg _neg_)
    {
        // Constructor
        setNeg(_neg_);

    }

    @Override
    public Object clone()
    {
        return new ANegUnop(
            cloneNode(this._neg_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANegUnop(this);
    }

    public TNeg getNeg()
    {
        return this._neg_;
    }

    public void setNeg(TNeg node)
    {
        if(this._neg_ != null)
        {
            this._neg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._neg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._neg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._neg_ == child)
        {
            this._neg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._neg_ == oldChild)
        {
            setNeg((TNeg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
