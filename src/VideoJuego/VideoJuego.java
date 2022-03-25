package VideoJuego;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;
import java.applet.AudioClip;

/* @author Platas Soto Cristian Uriel*/
public class VideoJuego extends Applet implements KeyListener {

    final char derecha = 'd';
    final char izquierda = 'a';
    final char derecha1 = 'k';
    final char izquierda1 = 'ñ';
    final char disparo = 'q';
    final char disparo1 = 'Q';
    final char disparo2 = 'l';
    final char disparo3 = 'L';
    final char arriba = 'w';
    char tecla;
    int x = 500, y = 420;
    int w = 550, z = 420;
    int p = 400, q = 300;
    int ñ = 540, o = 0;
    int m = 750, n= 150;
    int i= 100, j=180;
    int w1 = 495 , z1 = 50;
    int i1 = 300 , j1= 60;
    int AAa = -200;
    int m2 = -150, n2 = 60;
    int m3 = -300, n3 = -180;
    int m4 = 200, n4 = 420;
    int m5 = 400, n5 = 420;
    
    int e1 = 591, f1 = 420;
    int M2 = 800, N2 = 150;
    int M3 = 850, N3 = 150;
    int II = -900, III = -150;
    int BB = 1, BBB = 1;

    
    // Para Reproducir Soundtrack  //
    int AA = -495 , AAA = -50;
    int aaaa;
    int aaa;
    int AAAA;
    int AAAa = 10;
    int AAaa = 10;
    int AAAaaa = 10;
    int AAAaaaA = 10;
    
    int v, u, t, h, e, V1, u1, u2;
    int[] k = {480, 530, 530, 480};
    int[] l = {70, 70, 120, 120}; 
    
    Image a;
    Image b;
    Image c;
    Image d;
    Image f;
    Image a1;
    Image a3;
    Image a4;
    Image a5;
    Image a6;
    Image a7;
    Image a8;
    Image a9;
    Image a10;
    Image a11;
    Image a12;
    
    // Para Soundtrack //
    Image a2;
    
    AudioClip s1;
    AudioClip s2;
    AudioClip s3;
    AudioClip s4;
    AudioClip s5;
    AudioClip s6;
    AudioClip s7;
    AudioClip s8;
    AudioClip s9;
    AudioClip s10;
    AudioClip s11;
    AudioClip s12;
    AudioClip s13;

    /**
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(1, 1, 640, 480);
        g.setColor(Color.RED);
        g.fillRect(590, 400, 32, 10);
        g.drawImage(b, w, z, this);
        g.drawImage(a, x, y, this);
        g.drawImage(c, p, q, this);
        g.drawImage(d, ñ, o, this);
        g.drawImage(f, m, n, this);
        g.drawImage(a9, M2, N2, this);
        g.drawImage(c, i, j, this);
        g.drawImage(c, i1, j1, this);
        g.drawImage(a1, w1, z1, this);
        g.drawImage(a5, AAa, AAA, this);
        g.drawImage(a8, e1, f1, this);
        g.drawImage(a7, m3, n3, this);
        g.drawImage(a11, II, III, this);
       
        
        // Imagen Para Reproducir Soundtrack//
        g.drawImage(a2, AA, AAA, this);
       
        g.setColor(Color.WHITE);
        g.drawLine(1, 360, 640, 360);
        g.drawLine(1, 240, 640, 240);
        g.drawLine(1, 120, 640, 120);
        g.drawRect(540,0,640,60);
        g.drawLine(590, 0, 590, 60);
        g.drawLine(540, 30, 640,30);
        g.setColor(Color.CYAN);
        g.drawRect(700, 100, 500, 120);
        g.setColor(Color.RED);
        g.setFont(new Font("Impact",Font.BOLD|Font.ITALIC,20));
        g.setColor(Color.BLUE);
        g.drawString(" Inventario ",900,70);
        g.setColor(Color.RED);
        g.fillPolygon(k, l, 4);
        g.setColor(Color.YELLOW);
        g.fillRect(5, 500, 300, 40);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact",Font.BOLD|Font.ITALIC,20));
        g.drawString(" Objetivo Actual ",10,530);
        g.setColor(Color.BLUE);
        g.drawRect(5, 550, 300, 100);
        g.setColor(Color.BLACK);
        g.setFont(new Font("Impact",Font.BOLD,15));
        g.drawString(" Infiltrate al edifico y elimina ",6,600);
        g.drawString(" a los guardias sigilosamente ",6,630);
        g.setColor(Color.CYAN);
        g.drawRect(480,50,49,20);
        /*g.setColor(Color.RED);
        g.setFont(new Font("Impact",Font.BOLD,25));
        g.drawString(" VIDAS ",920,250);*/
        
        
        // SOUNDTRACK //
        while(aaaa <= 120)
        {
        if(AA == -495 && AAA == -50)
        {
         s4.play();   
         s3.play();       
         s6.play();
        }
        aaaa++;
        }
       
               
        // BLOQUEO DE MAPA //
        if(x == 0 && y == 420)
        {
         x = x+10;           
        }
        if(x == 610 && y == 420)
        {
         x = x-10;   
        }
        if(x==10 && y == 300)
        {
         x = x+10;   
        }
        if(x == 610 && y == 300)
        {
         x = x-10;   
        }
        if(x==10 && y == 180)
        {
         x = x+10;   
        }
        if(x == 610 && y == 180)
        {
         x = x-10;   
        }
        if(x==10 && y == 60)
        {
         x = x+10;   
        }
        if(x == 610 && y == 60)
        {
         x = x-10;   
        }
        if(x == 450 && y == 60)
        {
         x = x-10;   
        }
        if(w == 110  && z == 420)
        {
         w = w+10;           
        }
        if(w == 610 && z == 420)
        {
         w = w-10;   
        }
        
      
      // DISPARO DERECHA //
      int r = x+20, r1 = y+37, r2 = 0;
      if (tecla == disparo)
      {
       s2.play();
       s5.play();
       a = getImage(getCodeBase(), "d.jpg");
       g.drawImage(a, x, y, this);
       while(r2<=20)
       {
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(r,r1,5,5);
        try
        {
         Thread.sleep(r2);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(r,r1,5,5);
        r = r + r2;
        r2 = r2 + 1;
       }
      }
      
      // Disparar Enemigo 1 //
      if (r>=400 && y==300)
      {
       p= -100;
       q= -100;
      }
      // Disparar Enemigo 3 //
      if (r>=300 && y==60)
      {
       i1= -100;
       j1= -100;
      }
      
      
      // DISPARO IZQUIERDA //
      int V = x, v1 = y+37, v2 = 0;
      if (tecla == disparo1)
      {
       s2.play();
       s5.play();
       a = getImage(getCodeBase(), "D1.jpg");
       g.drawImage(a, x, y, this);
       while(v2<=20)
       {
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(V,v1,5,5);
        try
        {
         Thread.sleep(v2);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(V,v1,5,5);
        V = V - v2;
        v2 = v2 + 1;
       }
      }
       
      // Disparar Enemigo 2 //
      if (V <= 100 && y==180)
       {
       i= -100;
       j= -100;
       }

      

      
      //Dibujo Primera Escalera//
      for (v = 10; v <= 110; v += 10) 
        {
         g.setColor(Color.WHITE);
         g.drawLine(100 - v, 480 - v, 110 - v, 480 - v); 
        }
      
      // Subir Primera Escalera //
      if (x == 110 && y == 420) 
        {
         while (u <= 120) 
         {
          try 
          {
           Thread.sleep(10);
          } 
          catch (InterruptedException ex) 
          {}
           x = x + u;
           y = y - u;
           u = u + 10;
         }
         x = 50;
         y = 300;
        }
      
      // Bajar Primera Escalera //
       if (x < 30 && y == 300) 
       {
        while (t <= 120) 
        {
         try 
         {
          Thread.sleep(10);
         } 
          catch (InterruptedException ex) 
         {}
          x = x + t;
          y = y - t;
          t = t + 10;
        }
        x = 130;
        y = 420;
       }
       
       // Enemigo 1 detecta jugador//
     
      if(x==350 && y==300 && p==400 && q==300)
      {
       s2.play();
       s5.play();
       int v3 = p, v4 = q+37, v5 = 0;
       c = getImage(getCodeBase(), "Poli1.jpg");   
       x=500;
       y=420;
       while(v5<=30)
       {  
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v3,v4,5,5);
        try
        {
         Thread.sleep(v5);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v3,v4,5,5);
        v3 = v3 - v5;
        v5 = v5 + 1;
      }   
     }   
      
      //Dibujo Segunda Escalera//
      for (v = 10; v <= 110; v += 10) 
      {
       g.setColor(Color.WHITE);
       g.drawLine(500 + v, 360 - v, 510 + v, 360 - v);
      }
      
      // Subir Segunda Escalera //
      if (x == 490 && y == 300) 
        {
         while (h <= 120) 
         {
          try 
          {
           Thread.sleep(10);
          } 
          catch (InterruptedException ex) 
          {}
           x = x + h;
           y = y - h;
           h = h + 10;
         }
         x = 560;
         y = 180;
        }
      //Bjar Segunda Escalera//
       if (x > 580 && y == 180) 
       {
        while (e <= 120) 
        {
         try 
         {
          Thread.sleep(10);
         } 
          catch (InterruptedException ex) 
         {}
          x = x + e;
          y = y - e;
          e = e + 10;
        }
        x = 470;
        y = 300;
       }
       
       // Enemigo 2 detecta jugador//
      if(x==170 && y==180 && i==100 && j==180)
      {
       s2.play();
       s5.play();
       int v6 = i+30, v7 = j+37, v8 = 0;   
       x=500;
       y=420;
       p = 400;
       q = 300;       
       while(v8<=30)
       {
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v6,v7,5,5);
        try
        {
         Thread.sleep(v8);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v6,v7,5,5);
        v6 = v6 + v8;
        v8 = v8 + 1;
        }
      }
      // Dibujar Tercera Escalera //
      for (V1 = 10; V1 <= 110; V1 += 10) 
      {
       g.setColor(Color.WHITE);
       g.drawLine(100 - V1, 240 - V1, 110 - V1, 240 - V1); 
      }
      
      // Subir Escalera 3 //
      if (x == 110 && y == 180) 
      {
       while (u1 <= 120) 
      {
        try 
      {
        Thread.sleep(10);
      } 
       catch (InterruptedException ex) 
      {}
        x = x + u1;
        y = y - u1;
        u1 = u1 + 10;
       }
        x = 40;
        y = 60;
        }
      
      // Bajar Escalera 3 //
      if (x < 30 && y == 60) 
       {
        while (u2 <= 120) 
        {
         try 
         {
          Thread.sleep(10);
         } 
          catch (InterruptedException ex) 
         {}
          x = x + u2;
          y = y - u2;
          u2 = u2 + 10;
        }
        x = 130;
        y = 180;
       }
      
        // Enemigo 3 detecta jugador//
     
      if(x==270 && y==60 && i1==300 && j1==60)
      {
       s2.play();
       s5.play();
       int v9 = i1, v10 = j1+37, v11 = 0;
       c = getImage(getCodeBase(), "Poli1.jpg");   
       x=500;
       y=420;
       p = 400;
       q = 300;
       i= 100;
       j= 180;       
       while(v11<=30)
       {
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v9,v10,5,5);
        try
        {
         Thread.sleep(v11);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v9,v10,5,5);
        v9 = v9 - v11;
        v11 = v11 + 1;
        }
      }
         
      // Objetivo Robar Diamante //
      if(p == -100 && q == -100 && i == -100 && j == -100 && i1 == -100 && j1 == -100)
      {
       g.setColor(Color.CYAN);
       g.fillRect(5, 500, 300, 40);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD|Font.ITALIC,20));
       g.drawString(" Objetivo Actual ",10,530);   
       g.setColor(Color.WHITE);
       g.fillRect(6, 553, 298, 90);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD,15));
       g.drawString(" Intenta robar el diamante disparando ",6,600);
       while (aaa <=120)
       {    
        s4.play();
        aaa++;
       }
     }
      
      // Disparar al vidrio//
      if (r>=480 && y==60)
      {
       AAa = -300;    
       while (AAAA <=120)
       {
        g.setColor(Color.BLACK);
        g.drawRect(480,50,49,20);   
        s7.play();
        s8.play();
        s9.play();
        s3.stop();
        AAAA++;
       }
       AAa = -300;
      }
      if(AAa == -300)
      {
       g.setColor(Color.BLACK);
       g.drawRect(480,50,49,20);
       g.setColor(Color.MAGENTA);
       g.fillRect(5, 500, 300, 40);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD|Font.ITALIC,20));
       g.drawString(" Objetivo Actual ",10,530);   
       g.setColor(Color.WHITE);
       g.fillRect(6, 553, 298, 90);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD,15));
       g.drawString(" Roba el Diamante ",6,600);
      }
      
      // Obtener Diamante y Aparicion Enemigo 4, 5 y 6 //
      if (x == 440 && y == 60)
      {
       s10.play();
       w1 = -500;
       z1 = -500;
       
      }
      if (w1 == -500 && z1 == -500)
      {
       m2 = 150;   
       m3 = 300;
       g.drawImage(a10, M3, N3, this);
       g.drawImage(a6, m2, n2, this);
       g.drawImage(a6, m4, n4, this);
       g.drawImage(a6, m5, n5, this);
       g.setColor(Color.RED);
       g.fillRect(5, 500, 300, 40);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD|Font.ITALIC,20));
       g.drawString(" Objetivo Actual ",10,530);   
       g.setColor(Color.WHITE);
       g.fillRect(6, 553, 298, 90);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD,15));
       g.drawString(" Escapa por el elvador ",6,600);
       g.setColor(Color.PINK);
       g.fillRect(590, 400, 32, 10);
       while (AAAa <=120)
       {
        s7.play();
        s4.play();
        s11.play();
        AAAa++;   
       }
      }

      //Deteccion Enemigo 4 //
     if(x==190 && y==60 && m2==150 && n2==60)
      {
       s2.play();
       s5.play();
       int v12 = m2+30, v13 = n2+37, v14 = 0;   
       x=400;
       y=60;     
       while(v14<=30)
       {
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v12,v13,5,5);
        try
        {
         Thread.sleep(v14);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.LIGHT_GRAY);
        g.fillOval(v12,v13,5,5);
        v12 = v12 + v14;
        v14 = v14 + 1;
        }
      }
     // Disparar Enemigo 4 //
      if (V <= m2 && y==60)
     {
     m2 = -100;
     n2 = -100;
     }
    if (y == 420 && x >= 590 && w1 == -500 && z1 == -500)
    {
       m3 = 300;
       n3 = 180;
       g.setColor(Color.BLUE);
       g.fillRect(5, 500, 300, 40);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD|Font.ITALIC,20));
       g.drawString(" Objetivo Actual ",10,530);   
       g.setColor(Color.WHITE);
       g.fillRect(6, 553, 298, 90);
       g.setColor(Color.BLACK);
       g.setFont(new Font("Impact",Font.BOLD,15));
       g.drawString(" Necesitas la tarjeta ",6,600);
       while (AAaa <=120)
       {
        s4.play();
        AAaa++;   
       }
    
    // Tarjeta //
    }
     if( m3 == 300 && n3 == 180 && x== 300 && y == 180 )
     {
      m3 = -150;
      n3 = -100;
      s12.play();
      p = -700;
      q = -700;
     }
     
     // Escapar //
     if (p == -700 && q == -700)
     {
      II = 900;
      III = 150;
      g.setColor(Color.GREEN);
      g.fillRect(5, 500, 300, 40);
      g.setColor(Color.BLACK);
      g.setFont(new Font("Impact",Font.BOLD|Font.ITALIC,20));
      g.drawString(" Objetivo Actual ",10,530);
      g.setColor(Color.WHITE);
      g.fillRect(6, 553, 298, 90);
      g.setColor(Color.BLACK);
      g.setFont(new Font("Impact",Font.BOLD,15));
      g.drawString(" ESCAPA! ",6,600); 
     }
     
     // Final //
     if (II == 900 && III == 150 && x >= 580 && y == 420 && w >= 580 && z == 420)
     {
      x = 1000;
      y = 420;
     g.setColor(Color.GREEN);
     g.fillRect(590, 400, 32, 10);
      g.setColor(Color.WHITE);
      g.fillRect(1, 1, 2000, 800);
      g.setColor(Color.BLACK);
      g.fillRect(1, 1, 640, 480);
      g.setColor(Color.GREEN);
      g.setFont(new Font("Impact",Font.BOLD,20));
      g.drawString(" GANASTE ",50,200);  
      g.drawImage(a12, BB, BBB, this);
      s13.play();
      s9.stop();
     }
      
     // Dispara Jugador 2 //
     // DISPARO DERECHA //
      
     int b1 = w+20, b2 = z+37, b3 = 0;
      if (tecla == disparo2)
      {
       s2.play();
       s5.play();
       b = getImage(getCodeBase(), "Wolf.jpg");
       g.drawImage(b, w, z, this);
       while(b3<=20)
       {
        g.setColor(Color.RED);
        g.fillOval(b1,b2,5,5);
        try
        {
         Thread.sleep(b3);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.RED);
        g.fillOval(b2,b2,5,5);
        b1 = b1 + b3;
        b3 = b3 + 1;
       }
      }
      
      // Disparo Izquierda //
      int b4 = w, b5 = z+37, b6 = 0;
      if (tecla == disparo3)
      {
       s2.play();
       s5.play();
       b = getImage(getCodeBase(), "Wolf 1.jpg");
       g.drawImage(b, w, z, this);
       while(b6<=20)
       {
        g.setColor(Color.RED);
        g.fillOval(b4,b5,5,5);
        try
        {
         Thread.sleep(v2);   
        }
        catch (InterruptedException ex)
        {}
        g.setColor(Color.RED);
        g.fillOval(b4,b5,5,5);
        b4 = b4 - b6;
        b6 = b6 + 1;
       }
      }
      // Disparar Enemigo 6 //
      if (b4 <= m4 && z==420)
     {
     m4 = -100;
     n4 = -100;
     }
     // Disparar Enemigo 5 //
     if (b4 <= m5 && z==420)
     {
     m5 = -100;
     n5 = -100;
     }
     
     if(m4 == 200 && n4 == 420 && m5 ==400  && n5 == 420)
     {
      if(x == 60 && y == 300)
      {
       x = x+10;   
      }
     }
     /*int BBBBB = 490;
      while (BBBBB >= -10)
     {
      g.setColor (Color.BLACK);
      g.setFont(new Font("Impact",Font.ITALIC,20));
      g.drawString ("Juego Creado por ", 600,BBBBB);
      try
      {
       Thread.sleep(3);   
      }
      catch (InterruptedException ex)
      {}
      g.setColor (Color.WHITE);
      g.setFont(new Font("Impact",Font.ITALIC,20));
      g.drawString ("Juego Creado por ", 1000,BBBBB);
      BBBBB = BBBBB - 1;
      
     }*/ 
             
    }
    
    /**
     *
     */
    @Override
    public void init() {
        requestFocus();
        a = getImage(getCodeBase(), "Dallas1.jpg");
        b = getImage(getCodeBase(), "Wolf 1.jpg");
        c = getImage(getCodeBase(), "Poli.jpg");
        d = getImage(getCodeBase(), "Fondo.jpg");
        f = getImage(getCodeBase(), "Inventario 1.jpg");
        a1 = getImage(getCodeBase(), "Diamante.jpg");
        a3 = getImage(getCodeBase(), "Vida.jpg");
        a4 = getImage(getCodeBase(), "XVida.jpg");
        a5 = getImage(getCodeBase(), "Dallas11.jpg");
        a6 = getImage(getCodeBase(), "Enemigo.jpg");
        a7 = getImage(getCodeBase(), "Tarjeta.jpg");
        a8 = getImage(getCodeBase(), "Elevador.jpg");
        a9 = getImage(getCodeBase(), "Inventario 2.jpg");
        a10 = getImage(getCodeBase(), "Inventario 3.jpg");
        a11 = getImage(getCodeBase(), "Inventario 4.jpg");
        a12 = getImage(getCodeBase(), "win.jpg");
        
        // Para Soundtrack //
        a2 = getImage(getCodeBase(), "D1.jpg");

        s1 = java.applet.Applet.newAudioClip(getClass().getResource("/Paso.wav"));
        s2 = java.applet.Applet.newAudioClip(getClass().getResource("/Disparo.wav"));
        
        // Soundtrack //
        s3 = java.applet.Applet.newAudioClip(getClass().getResource("/Soundtrack.wav"));
        s4 = java.applet.Applet.newAudioClip(getClass().getResource("/Objetivo.wav"));
        
        s5 = java.applet.Applet.newAudioClip(getClass().getResource("/Casquillo.wav"));
        s6 = java.applet.Applet.newAudioClip(getClass().getResource("/Inicio.wav"));
        s7 = java.applet.Applet.newAudioClip(getClass().getResource("/Alarma.wav"));
        s8 = java.applet.Applet.newAudioClip(getClass().getResource("/Noo.wav"));
        s9 = java.applet.Applet.newAudioClip(getClass().getResource("/Soundtrack2.wav"));
        s10 = java.applet.Applet.newAudioClip(getClass().getResource("/Motin.wav"));
        s11 = java.applet.Applet.newAudioClip(getClass().getResource("/Enemigo.wav"));
        s12 = java.applet.Applet.newAudioClip(getClass().getResource("/Llave.wav"));
        s13 = java.applet.Applet.newAudioClip(getClass().getResource("/Win.wav"));
        addKeyListener(this);
    }

    /**
     *
     * @param ke
     */
    @Override
    public void keyTyped(KeyEvent ke) {
        tecla = ke.getKeyChar();
        switch (tecla) {
            case derecha:
                a = getImage(getCodeBase(), "Dallas.jpg");
                s1.play();
                x += 10;
                break;
            case izquierda:
                a = getImage(getCodeBase(), "Dallas1.jpg");
                s1.play();
                x -= 10;
                break;
           case arriba:
                a = getImage(getCodeBase(),"Dallas.jpg"); 
                if (x == 230 && y == 300)
                {  
                x = 380;
                y = 300;
                }
                case derecha1:
                b = getImage(getCodeBase(),"Wolf 1.jpg");
                s1.play();
                w -= 10;
                break;
               case izquierda1:
                b = getImage(getCodeBase(),"Wolf.jpg");
                s1.play();
                w += 10;
                break; 
                
        
                

                
        }
        repaint();
    }

    /**
     *
     * @param ke
     */
    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param ke
     */
    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
