
package br.com.tdc.cdi;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;

/**
 *
 * @author otavio
 */
@ApplicationScoped
@Named
public class EnqueteBean implements Serializable{
    
    private List<Enquete> enquetes;
    private PieChartModel pieModel;
    
    @Inject
    private ContadorEnquete contadorEnquete;
    
    @Inject
    public void init(){
    atualizarGrafico();
    enquetes=new LinkedList<Enquete>();
    }
    
    public void adicionar(Enquete enquete){
  
        contadorEnquete.incrementar(enquete.getStatus());
        atualizarGrafico();
        enquetes.add(enquete);
    }
    
    public int getTotal(){
        return enquetes.size();
    }

    private void atualizarGrafico() {
        pieModel = new PieChartModel();
        pieModel.setData(contadorEnquete.getNumeros());
        
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
    
    
}
