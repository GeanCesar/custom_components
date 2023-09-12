package br.com.geancesar.componentes.listeners;

import br.com.geancesar.componentes.ProgressButton;

public interface ProgressButtonListener {

    void onLoading(ProgressButton botao);
    void onNormal(ProgressButton botao);

}
