public class tallervariable {
 public static void main(String[] args) {
  double d1, d2, d3;
  double t1, t2, t3;
  double l1, l2, l3;
  double precioLitro;
  double masaCargaKg;
  double largo, ancho, alto;
  double p1, p2, p3;
  double deprecPorKm;
  double volCamionM3;
  double fCO2;
  double galPorLitro;
  double vmin, vmax;
  double va, vb, ca, cb;
  double a, b, c;
  double w1, w2, w3, w4;
  double v1 = d1 / t1;
  double v2 = d2 / t2;
  double v3 = d3 / t3;
  double vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);
  double kml1 = d1 / l1;
  double kml2 = d2 / l2;
  double kml3 = d3 / l3;
  double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);
  double costoComb = (l1 + l2 + l3) * precioLitro;
  double deprec = (d1 + d2 + d3) * deprecPorKm;
  double peajes = p1 + p2 + p3;
  double costoDirecto = costoComb + deprec + peajes;
 double costoPorKm = costoDirecto / (d1 + d2 + d3);
  double volumenM3 = largo * ancho * alto;
 double densidad = masaCargaKg / volumenM3;
  double ocupacion = volumenM3 / volCamionM3;
  double COTotal = (l1 + l2 + l3) * fCO2;
   double COporKm = COTotal / (d1 + d2 + d3);

  double vms = vprom * 1000 / 3600;
  double galTot = (l1 + l2 + l3) * galPorLitro;
  double vnorm = (vprom - vmin) / (vmax - vmin);
  double vmedia = (v1 + v2 + v3) / 3.0;
 double sigma = Math.sqrt(((v1 - vmedia) * (v1 - vmedia)
          + (v2 - vmedia) * (v2 - vmedia)
           + (v3 - vmedia) * (v3 - vmedia)) / 3.0);
  double vpond_t = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);

 double c_vprom = ca + (cb - ca) * (vprom - va) / (vb - va);
  double costoMant = c_vprom * (d1 + d2 + d3);

  double kmlModelo = a * vprom * vprom + b * vprom + c;
 double litrosModelo = (d1 + d2 + d3) / kmlModelo;
 double score = w1 * (1 / costoPorKm)
                     + w2 * kmltotal
                     + w3 * (1 / COporKm)
                     + w4 * (1 / (1 + sigma));

System.out.println("Velocidad promedio: " + vprom);
System.out.println("Rendimiento total: " + kmltotal);
 System.out.println("Costo por km: " + costoPorKm);
System.out.println("Volumen carga: " + volumenM3);
System.out.println("Emisiones CO2: " + COTotal);
 System.out.println("Velocidad normalizada: " + vnorm);
System.out.println("Desviación estándar: " + sigma);
System.out.println("Costo mantenimiento: " + costoMant);
 System.out.println("Modelo kml(v): " + kmlModelo);
  System.out.println("Score: " + score);
    }
}
}


public class tallervariableCasoA {
    public static void main(String[] args) {
        double d1 = 42.0, d2 = 58.5, d3 = 37.2;
        double t1 = 0.9, t2 = 1.4, t3 = 0.8;
        double l1 = 5.1, l2 = 6.9, l3 = 4.3;
        double precioLitro = 1.35, masaCargaKg = 1200;
        double largo = 2.0, ancho = 1.2, alto = 1.1;
        double p1 = 2.5, p2 = 3.0, p3 = 2.0;
        double deprecPorKm = 0.08, volCamionM3 = 10.0;
        double fCO2 = 2.68, galPorLitro = 0.264172;
        double vmin = 30, vmax = 90;
        double va = 40, vb = 80, ca = 0.05, cb = 0.09;
        double a = -0.0008, b = 0.08, c = 4.0;

        double v1 = d1 / t1, v2 = d2 / t2, v3 = d3 / t3;
        double vprom = (d1 * v1 + d2 * v2 + d3 * v3) / (d1 + d2 + d3);

        double kml1 = d1 / l1, kml2 = d2 / l2, kml3 = d3 / l3;
        double kmltotal = (d1 + d2 + d3) / (l1 + l2 + l3);

        double costoComb = (l1 + l2 + l3) * precioLitro;
        double deprec = (d1 + d2 + d3) * deprecPorKm;
        double peajes = p1 + p2 + p3;
        double costoDirecto = costoComb + deprec + peajes;
        double costoPorKm = costoDirecto / (d1 + d2 + d3);

        double volumenM3 = largo * ancho * alto;
        double densidad = masaCargaKg / volumenM3;
        double ocupacion = volumenM3 / volCamionM3;

        double COTotal = (l1 + l2 + l3) * fCO2;
        double COporKm = COTotal / (d1 + d2 + d3);

        double vprom_ms = vprom * 1000 / 3600;
        double galTot = (l1 + l2 + l3) * galPorLitro;
        double vnorm = (vprom - vmin) / (vmax - vmin);

        double vmedia = (v1 + v2 + v3) / 3;
        double sigma = Math.sqrt(((v1 - vmedia) * (v1 - vmedia) + (v2 - vmedia) * (v2 - vmedia) + (v3 - vmedia) * (v3 - vmedia)) / 3);
        double vpond_t = (t1 * v1 + t2 * v2 + t3 * v3) / (t1 + t2 + t3);

        double c_vprom = ca + (cb - ca) * (vprom - va) / (vb - va);
        double costoMant = c_vprom * (d1 + d2 + d3);

        double kmlModelo = a * vprom * vprom + b * vprom + c;
        double litrosModelo = (d1 + d2 + d3) / kmlModelo;

        double w1 = 0.25, w2 = 0.25, w3 = 0.25, w4 = 0.25;
        double score = w1 * (1 / costoPorKm) + w2 * kmltotal + w3 * (1 / COporKm) + w4 * (1 / (1 + sigma));

        System.out.println("v1=" + v1 + " v2=" + v2 + " v3=" + v3 + " vprom=" + vprom);
        System.out.println("kml1=" + kml1 + " kml2=" + kml2 + " kml3=" + kml3 + " kmltotal=" + kmltotal);
        System.out.println("costoComb=" + costoComb + " deprec=" + deprec + " peajes=" + peajes + " costoDirecto=" + costoDirecto + " costoPorKm=" + costoPorKm);
        System.out.println("volumenM3=" + volumenM3 + " densidad=" + densidad + " ocupacion=" + ocupacion);
        System.out.println("COTotal=" + COTotal + " COporKm=" + COporKm);
        System.out.println("vprom_ms=" + vprom_ms + " galTot=" + galTot + " vnorm=" + vnorm);
        System.out.println("vmedia=" + vmedia + " sigma=" + sigma + " vpond_t=" + vpond_t);
        System.out.println("c(vprom)=" + c_vprom + " costoMant=" + costoMant);
        System.out.println("kmlModelo=" + kmlModelo + " litrosModelo=" + litrosModelo);
        System.out.println("score=" + score);
    }
}
                                     
